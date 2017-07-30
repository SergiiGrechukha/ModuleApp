package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass264 {

    @Ignore    private SampleClass265 sampleClass;

    public SampleClass264(){
        sampleClass = new SampleClass265();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}