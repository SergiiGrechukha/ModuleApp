package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass663 {

    @Ignore    private SampleClass664 sampleClass;

    public SampleClass663(){
        sampleClass = new SampleClass664();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}