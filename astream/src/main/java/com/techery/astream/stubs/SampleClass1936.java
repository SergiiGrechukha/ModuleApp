package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1936 {

    @Ignore    private SampleClass1937 sampleClass;

    public SampleClass1936(){
        sampleClass = new SampleClass1937();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}