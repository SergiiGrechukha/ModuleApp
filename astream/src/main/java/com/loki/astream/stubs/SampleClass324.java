package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass324 {

    @Ignore    private SampleClass325 sampleClass;

    public SampleClass324(){
        sampleClass = new SampleClass325();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}