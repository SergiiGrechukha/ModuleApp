package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1791 {

    @Ignore    private SampleClass1792 sampleClass;

    public SampleClass1791(){
        sampleClass = new SampleClass1792();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}