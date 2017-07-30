package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass155 {

    @Ignore    private SampleClass156 sampleClass;

    public SampleClass155(){
        sampleClass = new SampleClass156();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}