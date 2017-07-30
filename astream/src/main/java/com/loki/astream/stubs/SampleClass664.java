package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass664 {

    @Ignore    private SampleClass665 sampleClass;

    public SampleClass664(){
        sampleClass = new SampleClass665();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}