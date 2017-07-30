package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass676 {

    @Ignore    private SampleClass677 sampleClass;

    public SampleClass676(){
        sampleClass = new SampleClass677();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}