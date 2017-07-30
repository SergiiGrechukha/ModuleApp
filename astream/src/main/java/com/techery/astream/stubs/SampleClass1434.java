package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1434 {

    @Ignore    private SampleClass1435 sampleClass;

    public SampleClass1434(){
        sampleClass = new SampleClass1435();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}