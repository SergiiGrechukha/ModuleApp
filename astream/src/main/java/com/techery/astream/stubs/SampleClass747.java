package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass747 {

    @Ignore    private SampleClass748 sampleClass;

    public SampleClass747(){
        sampleClass = new SampleClass748();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}