package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1644 {

    @Ignore    private SampleClass1645 sampleClass;

    public SampleClass1644(){
        sampleClass = new SampleClass1645();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}