package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass605 {

    @Ignore    private SampleClass606 sampleClass;

    public SampleClass605(){
        sampleClass = new SampleClass606();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}