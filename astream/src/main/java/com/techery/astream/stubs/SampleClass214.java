package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass214 {

    @Ignore    private SampleClass215 sampleClass;

    public SampleClass214(){
        sampleClass = new SampleClass215();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}