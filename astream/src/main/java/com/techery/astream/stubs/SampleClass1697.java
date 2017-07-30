package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1697 {

    @Ignore    private SampleClass1698 sampleClass;

    public SampleClass1697(){
        sampleClass = new SampleClass1698();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}