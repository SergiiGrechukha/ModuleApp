package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1342 {

    @Ignore    private SampleClass1343 sampleClass;

    public SampleClass1342(){
        sampleClass = new SampleClass1343();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}