package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1795 {

    @Ignore    private SampleClass1796 sampleClass;

    public SampleClass1795(){
        sampleClass = new SampleClass1796();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}