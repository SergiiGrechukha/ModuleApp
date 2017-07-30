package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass511 {

    @Ignore    private SampleClass512 sampleClass;

    public SampleClass511(){
        sampleClass = new SampleClass512();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}