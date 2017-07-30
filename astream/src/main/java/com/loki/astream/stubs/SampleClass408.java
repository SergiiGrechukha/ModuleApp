package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass408 {

    @Ignore    private SampleClass409 sampleClass;

    public SampleClass408(){
        sampleClass = new SampleClass409();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}