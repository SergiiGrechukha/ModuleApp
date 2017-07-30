package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1645 {

    @Ignore    private SampleClass1646 sampleClass;

    public SampleClass1645(){
        sampleClass = new SampleClass1646();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}