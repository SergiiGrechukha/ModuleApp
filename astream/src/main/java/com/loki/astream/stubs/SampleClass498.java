package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass498 {

    @Ignore    private SampleClass499 sampleClass;

    public SampleClass498(){
        sampleClass = new SampleClass499();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}