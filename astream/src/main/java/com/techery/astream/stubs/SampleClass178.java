package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass178 {

    @Ignore    private SampleClass179 sampleClass;

    public SampleClass178(){
        sampleClass = new SampleClass179();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}