package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass239 {

    @Ignore    private SampleClass240 sampleClass;

    public SampleClass239(){
        sampleClass = new SampleClass240();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}