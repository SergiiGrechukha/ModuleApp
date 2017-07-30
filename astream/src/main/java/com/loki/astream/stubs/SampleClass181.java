package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass181 {

    @Ignore    private SampleClass182 sampleClass;

    public SampleClass181(){
        sampleClass = new SampleClass182();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}