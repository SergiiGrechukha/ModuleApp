package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass987 {

    @Ignore    private SampleClass988 sampleClass;

    public SampleClass987(){
        sampleClass = new SampleClass988();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}