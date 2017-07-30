package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass323 {

    @Ignore    private SampleClass324 sampleClass;

    public SampleClass323(){
        sampleClass = new SampleClass324();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}