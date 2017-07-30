package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass899 {

    @Ignore    private SampleClass900 sampleClass;

    public SampleClass899(){
        sampleClass = new SampleClass900();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}