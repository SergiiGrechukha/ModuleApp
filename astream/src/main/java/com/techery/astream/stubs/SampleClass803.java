package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass803 {

    @Ignore    private SampleClass804 sampleClass;

    public SampleClass803(){
        sampleClass = new SampleClass804();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}