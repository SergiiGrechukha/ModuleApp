package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass562 {

    @Ignore    private SampleClass563 sampleClass;

    public SampleClass562(){
        sampleClass = new SampleClass563();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}