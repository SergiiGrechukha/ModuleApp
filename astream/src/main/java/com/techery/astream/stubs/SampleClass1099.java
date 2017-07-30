package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1099 {

    @Ignore    private SampleClass1100 sampleClass;

    public SampleClass1099(){
        sampleClass = new SampleClass1100();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}