package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1698 {

    @Ignore    private SampleClass1699 sampleClass;

    public SampleClass1698(){
        sampleClass = new SampleClass1699();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}