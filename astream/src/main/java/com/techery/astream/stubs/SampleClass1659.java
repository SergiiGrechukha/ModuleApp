package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1659 {

    @Ignore    private SampleClass1660 sampleClass;

    public SampleClass1659(){
        sampleClass = new SampleClass1660();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}