import java.io.*;
import java.util.*;
class PerfDebug {
    static long incs = 0;
    static long decs = 0;
    static long adds = 0;
    static long muls = 0;
    static long subs = 0;
    static long divs = 0;
    static long eqs = 0;
    static long lts = 0;
    static long mods = 0;
    
    static void debug() {
        System.out.println("Incs : " + incs);
        System.out.println("Decs : " + decs);
        System.out.println("Adds : " + adds);
        System.out.println("Muls : " + muls);
        System.out.println("Subs : " + subs);
        System.out.println("Divs : " + divs);
        System.out.println("Eqs  : " + eqs);
        System.out.println("Lts  : " + lts);
        System.out.println("Mods : " + mods);
    }
}
class $$$${
    $$$$(){}
    $$$$(Object $){
        this.$+=$;
    }
    static $$$$ $(Object $){
        return new $$$$($);
    }
    $$$$ $(){
        PerfDebug.incs++;
        return $$$$.$("S("+$+")");
    }
    $$$$ $$$(){
        PerfDebug.decs++;
        if(_$$.$($,$$$$.$$.$))return null;
        $$$$ __$=$$$$.$$;
        for(String $__:("0"+$
            ).split("\\(|0(\\)+|.)")){
            if(!$__.isEmpty())__$=__$.$();
        }
        return __$;
    }
    //add
    $$$$ $$$$($$$$ $$){
        PerfDebug.adds++;
        return _$$.$($$$$.$$.$,$$.$)?$$$$.$($):$$$$($$.$$$()).$();
    }
    //mul
    $$$$ $$$$$($$$$ $$$){
        PerfDebug.muls++;
        return ___()||_$$.$($$$.$,$$$$.$$.$)?$$$$.$$:$$$$($$$$$($$$.$$$()));
    }
    //sub
    $$$$ $$$$$$($$$$ $$){
        PerfDebug.subs++;
        return _$$.$($$$$.$$.$,$$.$)?this:___()?$$$$.$$:$$$().$$$$$$($$.$$$());
    }
    //div
    $$$$ $$$$$$$($$$$ $$){
        PerfDebug.divs++;
        return $().$$$$$$($$).___()?$$$$.$$:$$$$$$($$).$$$$$$$($$).$();
    }
    //eq
    boolean $_$($$$$ $$) {
        PerfDebug.eqs++;
        return _$$.$($,$$.$);
        // return $$$$$$($$).___()&&$$.$$$$$$(this).___();
        // return $$_($$)&&$$.$$_(this);
        // return ___()&&$$.___()||!___()&&!$$.___()&&$$$().$_$($$.$$$());
    }
    //less than
    boolean $$_($$$$ $$) {
        PerfDebug.lts++;
        return $$$$$$($$).___()&&!$$.$$$$$$(this).___();
    }
    //mod
    $$$$ $$$$$$$$($$$$ $$){
        PerfDebug.mods++;
        return $$$$$$($$$$$$$($$).$$$$$($$));
    }
    String $$(){
        return this.$;
    }
    String $="";
    static $$$$ $$$$=$("S(0)");
    static $$$$ $$=$$$$.$("0");
    static $$$$ $$_$$=$("S(S(S(S(S(S(S(S(S(S(0))))))))))");
    static $$$$ $$_$_=$$_$$.$$$$$($$_$$);//100
    static $$$$ $$$$_=$$_$_.$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_).$$$$($$_$_);//1000
    
    boolean ___(){return _$$.$($$$$.$$.$,$);}
    int __(){
        int $$=0;
        if($$$()!=null&&$$--!=$$)
            for(String $$$$:$.split(
        "S|0.+")){
                $$++;
            }
        return $$;
    }
    char _$_(){return(char)__();}
    String $$$$$$$$$(String $$$){
        $$$$ $$=$$$$.$$;
        for(String $__:$$$.split(""))$$=$$.$();
        String $$$_$="",$$_$$;
        $$$$ _$$$$,$_$$$ = this;
        while(!$_$$$.$_$($$$$.$$)) {
            _$$$$ = $_$$$.$$$$$$$$($$);
            $_$$$ = $_$$$.$$$$$$$($$);
            $$_$$=$$$;
            while(!_$$$$.___()) {
                $$_$$=$$_$$.replaceFirst("^.","");
                _$$$$=_$$$$.$$$();
            }
            $$$_$ = $$_$$.charAt($$$$.$$.__()) + $$$_$;
        }
        return $$$_$;
    }
    static $$$$ $__($$$$ $$$,$$$$ $$){
        return $($$$.$+","+$$.$);
    }
}
//array
class $$${
    $$$(){$=$$$$.$("");$$$$$=$$$$.$$;}
    void $$($$$$ $$){
        if(!$$$$$.___())$.$+=",";
        $$$$$=$$$$$.$();
        $.$+=$$.$;
    }
    static $$$ $($$$$...$$){
        $$$ $$$$$=new $$$();
        for($$$$ $$$$:$$){
            $$$$$.$$($$$$);
        }
        return $$$$$;
    }
    void $_$_$($$$ $$){
        $=$$.$;$$$$$=$$.$$$$$;
    }
    //get
    $$$$ $$$$$$($$$$ $$){
        $$$$ $_$=$$$$.$$;
        // System.out.println("access el " + $$.__() );
        for(String $:$.$.split(",")){
            // System.out.println($_$.__() + " -> " + $);
            if($_$.$_$($$)) {
                $_$=$$$$.$($);
                break;
            }
            $_$=$_$.$();
        }
        // System.out.println($_$.$ + "; " + $$.$ + " ; " + $_$.$_$($$));
        return $_$;
    }
    $$$$ $,$$$$$;
    //set
    void $$$$$$$($$$$ $$,$$$$ $$_){
        $$$$ $_$=$$$$.$$;
        $$$ ____=$$$.$();
        for(String $:$.$.split(",")){
            ____.$$($_$.$_$($$)?$$_:$$$$.$($));
            $_$=$_$.$();
        }
        $_$_$(____);
    }
    $$$ __(){$$$ $$=$$$.$();$$.$=$;return $$;}
    $$$$[]$$$$(){
        $$$$[]$$=new $$$$[$$$$$.__()];
        $$$$ $$$=$$$$.$$;
        for(String $:$.$.split(",")){
            $$[$$$.__()]=$$$$.$($);
            $$$=$$$.$();
        }
        return $$;
    }
}
class _$${
    static boolean $(String $,String $$){
        return $.equals($$);
    }
    static $$$$ $$(String $){
        $$$$ $$$=$$$$.$$;
        if($.isEmpty())return $$$;
        for(String $$:$.split(""))$$$=$$$.$();
        return $$$;
    }
}
interface ${
    static void $($$$$ $$){
        System.out.println($$.$$());
    }
    static $$$$ $$(int $$$){
        $$$$ res = $$$$.$$;
        while($$$-->0){
            res = res.$();
        }
        return res;
    }
    static void main(String[]__)throws Exception{
        // return;
        // String base="..#\n";
        // System.out.println($$(440).$$$$$$$$$(base));
        long programStartTime = System.nanoTime();
        $$$$$.$=new $$$$$();
        boolean $$$$$$$$$$$$$=false;
        try{
            __[1]=__[1];
            $$$$$$$$$$$$$=true;
        }
        catch(Exception $$$$$$$$$$$$){}
        
        $$$$ _$,_$_,$_;_$=$_=_$_=$$$$.$$;
        //_$ is the running max
        //$_ is the total line count
        $$$ $$__=$$$.$();
        //$$__ is the board
        try(BufferedReader $__$=new BufferedReader(new FileReader(__[0]))){
            while((__[0]=$__$.readLine())!=null){
                _$_=_$$.$$(__[0]);
                if(_$.$$_(_$_))_$=_$_;
                $$__.$$($$$$.$(__[0]));
                $_=$_.$();
            }
        }
        // System.out.println("Width = " + _$.__());
        // System.out.println("Height = " + $_.__());
        __[0]="";
        for(String $$$$$:$$__.$.$.split(",")){
            __[0]+=$$$$$;
            _$_=_$.$$$$$$(_$$.$$($$$$$));
            while(!_$_.___()) {
                __[0]+=" ";
                _$_=_$_.$$$();
            }
        }
        $$__=$$$.$();
        for(String $$$$$:__[0].split("")){
            _$_=$$$$.$$.$();
            if(_$$.$($$$$$," ")||_$$.$($$$$$,"."))_$_=_$_.$$$(); 
            $$__.$$(_$_);
        }
        // update loop
        //$__$$ copy of board
        
        
        // 0 1 2
        // 3 . 4
        // 5 6 7
        System.out.println((System.nanoTime() - programStartTime) / 1000000 + "ms elapsed since program began");
        long loopStartTime = System.nanoTime();
        Scanner scanner = new Scanner(System.in);
        // int it = 3;
        if($$$$$$$$$$$$$) {
            System.out.print("\033[2J");
            System.out.flush();
        }
        while(true) {
            if($$$$$$$$$$$$$) {
                System.out.print("\033[H");
                System.out.flush();
            }
            $$$$ $$__$$ = $$$$.$$.$().$();
            $$$$ $$$___$$$ = $$__$$.$();
            $$$ $__$$=$$$.$();$__$$.$_$_$($$__);
            for($$$$ y = $$$$.$$; y.$$_($_); y=y.$()) {
                for($$$$ x = $$$$.$$; x.$$_(_$); x=x.$()) {
                    $$$$ id = y.$$$$$(_$).$$$$(x);
                    $$$$ sum = $$$$.$$;
                    $$$$ prev = $__$$.$$$$$$(id);
                    // neighbors
                    // System.out.println("(" + x.__() + ", " + y.__() + ")");
                    if(!y.___() && x.$$_(_$)) {
                        // 0: top left
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$().$$$$$$(_$)));
                    }
                    if(x.$$_(_$)) {
                        // 1: top center
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$$$$(_$)));
                    }
                    if(x.$().$$_(_$)) {
                        // 2: top right
                        sum = sum.$$$$($__$$.$$$$$$(id.$().$$$$$$(_$)));
                    }
                    if(!x.___()) {
                        // 3: middle left
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$()));
                    }
                    if(x.$().$$_(_$)) {
                        // 4: middle right
                        sum = sum.$$$$($__$$.$$$$$$(id.$()));
                    }
                    if(y.$().$$_($_)) {
                        // 5: bottom left
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$$(_$).$$$()));
                    }
                    if(y.$().$$_($_)) {
                        // 6: bottom center
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$$(_$)));
                    }
                    if(y.$().$$_($_) && x.$().$$_(_$)) {
                        // 7: bottom right
                        sum = sum.$$$$($__$$.$$$$$$(id.$$$$(_$).$()));
                    }
                    // check sums and set accordingly
                    if(prev.___()) {
                        if(sum.$_$($$$___$$$)) $$__.$$$$$$$(id,$$$$.$$.$());
                    }
                    else {
                        if(!(sum.$_$($$__$$) || sum.$_$($$$___$$$))) {
                            $$__.$$$$$$$(id,$$$$.$$);
                        }
                    }
                    // display previous grid
                    System.out.print(" "+".O".charAt($__$$.$$$$$$(id).__()));
                }
                System.out.println("");
            }
            System.out.println("");
            
            System.out.println((System.nanoTime() - loopStartTime) / 1000000 + "ms elapsed to complete loop iteration");
            if(!$$$$$$$$$$$$$) {
                try {
                    System.out.println("Press enter to continue, or type anything to stop");
                    if(!scanner.nextLine().isEmpty()) break;
                }
                catch(Exception $$$$$$$$$) {
                    break;
                }
            }
            loopStartTime = System.nanoTime();
        }
        
        System.out.println((System.nanoTime() - programStartTime) / 1000000 + "ms elapsed to complete program");
        PerfDebug.debug();
        // System.out.println($$__.__().$.$);
        // $$$ arr=$$$.$();
        // for(int i = 0; i < 5; i++) {
            // arr.$$($$(i * 3));
        // }
        // System.out.println(arr.$.$);
        // for($$$$ sub : arr.$$$$()) {
            // System.out.println(sub.__());
        // }
    }
}