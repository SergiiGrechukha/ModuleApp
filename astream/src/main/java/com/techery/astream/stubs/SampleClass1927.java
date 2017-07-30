package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1927 {

    @Ignore    private SampleClass1928 sampleClass;

    public SampleClass1927(){
        sampleClass = new SampleClass1928();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}