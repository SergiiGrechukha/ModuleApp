package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1675 {

    @Ignore    private SampleClass1676 sampleClass;

    public SampleClass1675(){
        sampleClass = new SampleClass1676();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}