package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass804 {

    @Ignore    private SampleClass805 sampleClass;

    public SampleClass804(){
        sampleClass = new SampleClass805();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}