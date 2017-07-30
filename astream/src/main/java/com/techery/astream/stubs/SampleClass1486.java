package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1486 {

    @Ignore    private SampleClass1487 sampleClass;

    public SampleClass1486(){
        sampleClass = new SampleClass1487();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}