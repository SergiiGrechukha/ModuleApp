package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass559 {

    @Ignore    private SampleClass560 sampleClass;

    public SampleClass559(){
        sampleClass = new SampleClass560();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}