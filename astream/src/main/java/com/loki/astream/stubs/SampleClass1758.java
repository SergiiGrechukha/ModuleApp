package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1758 {

    @Ignore    private SampleClass1759 sampleClass;

    public SampleClass1758(){
        sampleClass = new SampleClass1759();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}