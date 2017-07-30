package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1608 {

    @Ignore    private SampleClass1609 sampleClass;

    public SampleClass1608(){
        sampleClass = new SampleClass1609();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}