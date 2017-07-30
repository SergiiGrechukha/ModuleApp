package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass119 {

    @Ignore    private SampleClass120 sampleClass;

    public SampleClass119(){
        sampleClass = new SampleClass120();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}