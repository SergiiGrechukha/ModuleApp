package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass46 {

    @Ignore    private SampleClass47 sampleClass;

    public SampleClass46(){
        sampleClass = new SampleClass47();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}