const TRANSCRIBE_REP = {
    "-1": [3],
    "0": [],
    "1": [1],
    "2": [1, 2],
    "3": [1, 1, 1],
    "4": [1, 2, 2],
    "5": [1, 2, 2, 1],
    "6": [1, 1, 1, 2],
};
let transcribeSingle = (x) => {
    if(TRANSCRIBE_REP[x]) {
        return TRANSCRIBE_REP[x];
    }
    
    // console.log("Calculating... TRANSCRIBE(" + x + ")");
    
    let i = 0;
    let res = [];
    
    let n = x;
    
    if(n % 2 === 1) {
        n--;
        res.push(1);
    }
    
    while(n % 2 === 0) {
        res.unshift(2);
        n /= 2;
    }
    
    if(n !== 0) {
        let children = [
            n - 1,
            n,
            n + 1,
        ].map(np => [np, transcribeSingle(np)]);
        
        children[0][1].push(1);//+1
        children[2][1].push(3);//-1
        
        // console.log(children);
        
        let minSize = Infinity;
        let minVals = null;
        
        for(let [ np, vals ] of children) {
            // console.log(np,  vals);
            if(vals.length < minSize) {
                minVals = vals;
                minSize = minVals.length;
            }
        }
        
        res = minVals.concat(res);
        // console.log(res);
    }
    
    TRANSCRIBE_REP[x] = res;
    // console.log("TRANSCRIBE(" + x + ") = " + JSON.stringify(res));
    
    return res;
};

let transcribe = (des) => {
    
    let q = [];
    for(let str of des.split(".")) {
        let arr = [...str].map(e => e.charCodeAt());
        for(let c of arr) {
            q.push(...transcribeSingle(c), 5);
        }
        q.push(0);
    }
    q.pop();
    return q;
};

let checkVal = (arr) => {
    let i = 0;
    let s = [];
    for(let c of arr) {
        switch(c % 6) {
            case 0:
                console.log("WORD: " + Buffer.from(s) + " (" + JSON.stringify(s) + ")");
                s = [];
                break;
            case 1:
                i++;
                break;
            case 2:
                i *= 2;
                break;
            case 3:
                i--;
                break;
            case 4:
                i /= 2;
                break;
            case 5:
                s.push(i);
                i = 0;
                break;
        }
    }
    return s;
};

let randomize = (arr) => {
    arr = arr.map(mod => {
        let m = Math.random() * 14 | 0;
        m *= 6;
        return c = 36 + m + mod;
    });
    return arr;
    // return Buffer.from(arr).toString();
};

let a = transcribe("Hello, World!");
// let a = transcribe("process.stdout.write");
console.log(a);
let r = randomize(a);
console.log(r, r.map(e => e % 6));
console.log(JSON.stringify(Buffer.from(r) + []));
console.log(checkVal([...a, 0]));
console.log(checkVal([...r, 0]));