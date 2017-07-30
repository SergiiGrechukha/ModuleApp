package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1607 {

    @Ignore    private SampleClass1608 sampleClass;

    public SampleClass1607(){
        sampleClass = new SampleClass1608();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}