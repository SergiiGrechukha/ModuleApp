package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass160 {

    @Ignore    private SampleClass161 sampleClass;

    public SampleClass160(){
        sampleClass = new SampleClass161();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}