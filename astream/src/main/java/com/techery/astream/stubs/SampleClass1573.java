package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1573 {

    @Ignore    private SampleClass1574 sampleClass;

    public SampleClass1573(){
        sampleClass = new SampleClass1574();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}