package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1497 {

    @Ignore    private SampleClass1498 sampleClass;

    public SampleClass1497(){
        sampleClass = new SampleClass1498();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}