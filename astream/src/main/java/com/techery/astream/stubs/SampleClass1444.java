package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1444 {

    @Ignore    private SampleClass1445 sampleClass;

    public SampleClass1444(){
        sampleClass = new SampleClass1445();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}