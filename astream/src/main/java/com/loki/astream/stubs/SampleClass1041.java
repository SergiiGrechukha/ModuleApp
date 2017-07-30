package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1041 {

    @Ignore    private SampleClass1042 sampleClass;

    public SampleClass1041(){
        sampleClass = new SampleClass1042();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}