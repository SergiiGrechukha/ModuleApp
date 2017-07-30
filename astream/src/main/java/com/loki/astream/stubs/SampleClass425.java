package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass425 {

    @Ignore    private SampleClass426 sampleClass;

    public SampleClass425(){
        sampleClass = new SampleClass426();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}