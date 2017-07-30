package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass833 {

    @Ignore    private SampleClass834 sampleClass;

    public SampleClass833(){
        sampleClass = new SampleClass834();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}