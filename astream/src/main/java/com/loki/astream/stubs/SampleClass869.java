package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass869 {

    @Ignore    private SampleClass870 sampleClass;

    public SampleClass869(){
        sampleClass = new SampleClass870();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}