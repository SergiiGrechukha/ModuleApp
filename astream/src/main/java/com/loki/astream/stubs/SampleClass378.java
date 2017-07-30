package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass378 {

    @Ignore    private SampleClass379 sampleClass;

    public SampleClass378(){
        sampleClass = new SampleClass379();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}