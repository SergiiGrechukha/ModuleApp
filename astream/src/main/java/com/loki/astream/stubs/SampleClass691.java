package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass691 {

    @Ignore    private SampleClass692 sampleClass;

    public SampleClass691(){
        sampleClass = new SampleClass692();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}