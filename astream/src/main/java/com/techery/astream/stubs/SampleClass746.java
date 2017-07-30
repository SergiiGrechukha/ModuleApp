package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass746 {

    @Ignore    private SampleClass747 sampleClass;

    public SampleClass746(){
        sampleClass = new SampleClass747();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}