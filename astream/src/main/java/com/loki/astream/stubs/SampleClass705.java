package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass705 {

    @Ignore    private SampleClass706 sampleClass;

    public SampleClass705(){
        sampleClass = new SampleClass706();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}